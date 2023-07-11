SUMMARY = "An Integrated Development Environment for Python"
DESCRIPTION = "IDLE is a Tkinter based integrated development environment for Python. \
It features a multi-window text editor with multiple undo, Python \
colorizing, and many other things, as well as a Python shell window and \
a debugger."
LICENSE = "Python-2.0"

PV = "3.12.0b3"

RPM_NAME = "python312-idle-3.12.0b3-1.1.aarch64.rpm"
RPM_HASH = "264c7090604f5bce19ad2b2ad4ec58083e5f3031f67d7e65d3cb5fb8b7fc69663532538d3262e1d6d7be33bafbfe7949efe8967e7435c6e665ce2b93743077f9"

RPROVIDES:${PN} += "config-python312-idle \
python312-idle"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
python-abi \
python312 \
python312-tk"

inherit rpm
