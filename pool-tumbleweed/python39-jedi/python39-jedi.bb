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

PV = "0.19.0"

RPM_NAME = "python39-jedi-0.19.0-1.1.noarch.rpm"
RPM_HASH = "5fb40b61e8e81caabdd898ad48b40bb5f59125844d281bac656213895f2454ff7a46008d51930563eddaa447833090ea500f1880c61683d946aafc7422749f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jedi \
python39-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python39-parso >= 0.8.3 with python39-parso < 0.9 \
python-abi"

inherit rpm
