SUMMARY = "A set of Tkinter widgets to display readonly text and code"
DESCRIPTION = "A set of Tkinter widgets to display readonly text and code."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-tkreadonly-0.6.1-2.13.noarch.rpm"
RPM_HASH = "9bf8515a44d0506276acf72e3232973346470355191bf77ce4fbc0082f0d75efb5a8096ee5c2db580edb1cef22336fda15ef42adf2abbe54308a39f480cb1f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tkreadonly \
python310-tkreadonly \
python3dist-tkreadonly"

RDEPENDS:${PN} += "python-abi \
python310-Pygments \
python310-idle \
python310-tk"

inherit rpm
