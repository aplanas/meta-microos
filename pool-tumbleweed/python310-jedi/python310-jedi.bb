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

RPM_NAME = "python310-jedi-0.19.0-1.1.noarch.rpm"
RPM_HASH = "fc1696488d1ec68b9f7d308512b51679eafb7bb892f205c4c95b5452bf34bc31ff1ab6ae0e77c7c8e226fc635a80a808fcd820cc4b90352d0bceb8689477c4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jedi \
python310-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python310-parso >= 0.8.3 with python310-parso < 0.9 \
python-abi"

inherit rpm
