SUMMARY = "An autocompletion tool for Python"
DESCRIPTION = "Jedi is a static analysis tool for Python that can be used in \
IDEs/editors. Its focus is autocompletion and static \
analysis. \
 \
Jedi has support for two different goto functions. It's possible to \
search for related names and to list all names in a Python file and \
infer them. Jedi understands docstrings and you can use Jedi \
autocompletion in your REPL as well. \
 \
Jedi uses an API to connect with IDEs. There is a reference \
implementation as a VIM plugin which uses Jedi's autocompletion."
LICENSE = "MIT & Python-2.0"

PV = "0.18.2"

RPM_NAME = "python310-jedi-0.18.2-6.1.noarch.rpm"
RPM_HASH = "5f4cbd553a2f4fbd8da52c9072535d77244778888a39a683a3ef12ad8e1787ab74c1707ee15ea4eb593345e4b89ee5c25a948e5508d031ff21764e4d7a7416fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedi \
python3.10dist(jedi) \
python310-jedi \
python3dist(jedi)"
RDEPENDS:${PN} += "(python310-parso >= 0.8.0 with python310-parso < 0.9) \
python(abi)"

inherit rpm
