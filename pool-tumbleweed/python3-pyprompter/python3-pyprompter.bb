SUMMARY = "Intelligent predictive wxPython text editor"
DESCRIPTION = "This package contains the wxPython predictive text editor pyprompter. \
 \
pyprompter is a cross-platform predictive text editor. \
 \
pyprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-pyprompter-0.9.1-13.2.noarch.rpm"
RPM_HASH = "ab3a8ab07409cf7a870052ba0e0a0d5fe1260111cef8c17d760fbfe79dda397bd1722c09c52b9107e071c80ee73a7c66f09ba0aec99fa668123b531053d0caaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyprompter \
python3-pyprompter \
python3.11dist-pyprompter \
python3dist-pyprompter"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-presage \
python3-wxPython"

inherit rpm
