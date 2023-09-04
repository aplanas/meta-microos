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

RPM_NAME = "python311-jedi-0.19.0-1.1.noarch.rpm"
RPM_HASH = "c31d713387675282c053f72fd63c3287802fdeaad82574991c5fe98a584d6f3028bcb6987e738a5c200d03872dcf2ea0e419e77bad4a0baa6caf08d2ac68631a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jedi \
python3.11dist-jedi \
python311-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python311-parso >= 0.8.3 with python311-parso < 0.9 \
python-abi"

inherit rpm
