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

RPM_NAME = "python3-coconut-1.6.0-1.4.noarch.rpm"
RPM_HASH = "18a4dffbb3b0331137e369b4d35146e553250c26dce885fdc24f08c09109b67b05f9d1bcb61339724891833cb7773238f09a5aec80c5e1607a463921a13c589b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coconut \
python3.10dist-coconut \
python3dist-coconut"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Pygments \
python3-prompt-toolkit \
python3-pyparsing"

inherit rpm
