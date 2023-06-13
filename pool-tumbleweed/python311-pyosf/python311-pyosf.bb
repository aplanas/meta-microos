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

RPM_NAME = "python311-pyosf-1.0.5-5.8.noarch.rpm"
RPM_HASH = "421541d9d251a95c8aeea6da6a04d58f43e4a16594d36dd55c5a9af3bd56d1c588122216fe78ddab94516df69d93bd56ebaf709fcfdca606121a3d4e6dc60095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyosf) \
python311-pyosf \
python3dist(pyosf)"

RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
