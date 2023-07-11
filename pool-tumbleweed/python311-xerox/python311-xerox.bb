SUMMARY = "Simple Copy + Paste in Python"
DESCRIPTION = "Python copy and paste library supporting OS X, X11 (Linux, BSD, etc.), and Windows."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-xerox-0.4.1-2.16.noarch.rpm"
RPM_HASH = "57ed73cfbad0bff50d7e0f6d498174a24df331d6738c108aa6330a50d0183ba0331d48688179c5a50876c71ef1f3c9d7c2fa497ea13c68ec2bd2856c76cdc403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xerox \
python3.11dist-xerox \
python311-xerox \
python3dist-xerox"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives \
xclip"

inherit rpm
