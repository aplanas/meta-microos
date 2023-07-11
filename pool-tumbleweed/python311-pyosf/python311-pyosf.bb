SUMMARY = "Python lib for synching with OpenScienceFramework projects"
DESCRIPTION = "The pyosf package is a pure Python library for file sync with \
Open Science Framework. \
 \
This package is for synchronisation of files from the local \
file space to the Open Science Framework (OSF). There is a more \
complex sync package by the Center for Open Science, \
who created OSF, called osf-sync. \
 \
The OSF official package is designed for continuous automated \
synchronisation of many projects (à la Dropbox). The authors of pyosf \
needed something simpler (for combination with PsychoPy). The pyosf \
package performs basic search/login/sync operations with single \
projects on OSF, but only when instructed to do so (no continuous \
sync)."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python311-pyosf-1.0.5-5.10.noarch.rpm"
RPM_HASH = "76a1e2e5d73896568df0a77b1bb2394f5c612a97816b011dc6d63c983a1097e9f1f7067fe376755a0058324359cdaa71613a0460fdb8cba393f55b20da6c1e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyosf \
python3.11dist-pyosf \
python311-pyosf \
python3dist-pyosf"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
