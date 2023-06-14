SUMMARY = "A tool that simplifies the management of multiple versions of kubectl"
DESCRIPTION = "kuberlr (kube-ruler) is a simple wrapper for kubectl. Its main purpose is to \
make it easy to manage clusters running different versions of kubernetes."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "kuberlr-0.4.1-1.9.aarch64.rpm"
RPM_HASH = "735de350bfb921beaf0d1fd59206cf8994be63c7e1491303547cb7be8ccc74a13b3b0e039f1bb9f5a45ebd35158e0d58c0bf1e7412f89b7dfd057536ae71ae29"

RPROVIDES:${PN} += "kuberlr \
kubernetes-client-provider"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
libc.so.6 \
update-alternatives"

inherit rpm
