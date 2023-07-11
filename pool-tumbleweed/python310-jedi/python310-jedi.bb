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

RPM_NAME = "python310-jedi-0.18.2-6.3.noarch.rpm"
RPM_HASH = "a6e9a4a383f8d92e7236e5d0cbd2d65d5440f1165fb004bf524485678ef0328c57bd83e2f9c553216260b5b7c785c5c6fe0bfcc7a993dcb043cafc0807fd01b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jedi \
python310-jedi \
python3dist-jedi"

RDEPENDS:${PN} += "-python310-parso >= 0.8.0 with python310-parso < 0.9 \
python-abi"

inherit rpm
