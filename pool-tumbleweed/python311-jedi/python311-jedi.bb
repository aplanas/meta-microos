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

RPM_NAME = "python311-jedi-0.18.2-6.3.noarch.rpm"
RPM_HASH = "57bd9bb6430f106b941aa10f94e2b0385e00dbb5a082a4caf8d8e9172200654be38b9869ca75364b33bef1d9b58c43921aa8801de4e17885d94320acfa9ac425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedi \
python3.11dist-jedi \
python311-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python311-parso >= 0.8.0 with python311-parso < 0.9 \
python-abi"

inherit rpm
