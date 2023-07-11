SUMMARY = "A functional programming language that compiles to Python"
DESCRIPTION = "Coconut is a functional programming language that compiles to \
Python. Since all valid Python is valid Coconut, using Coconut will \
only extend and enhance what is already capable of in Python. \
 \
Coconut enhances the repertoire of Python programmers to include \
tools for functional programming. Coconut code runs the same on any \
Python version."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python3-coconut-1.6.0-1.5.noarch.rpm"
RPM_HASH = "bc1a70fc89d1644abb3eddbced41d7e3c4b7160633f87be79492f98c81ddf497145d276928715b387a7e9fb5a8101fe1bc14d52c6435b0c6705e0127fc3f1b9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coconut \
python3.11dist-coconut \
python3dist-coconut"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pygments \
python3-prompt-toolkit \
python3-pyparsing"

inherit rpm
