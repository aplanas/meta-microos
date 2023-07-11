SUMMARY = "Python toolkit for creating graphical user interfaces"
DESCRIPTION = "Flexx is a pure Python toolkit for creating graphical user interfaces \
(GUIs), that uses web technology for its rendering. Apps are written \
purely in Python; Flexx's transpiler generates the necessary JavaScript \
on the fly. \
 \
Flexx can be used to create (cross platform) desktop applications, web \
applications, and (if designed well) export an app to a standalone HTML \
document. It also works in the Jupyter notebook."
LICENSE = "BSD-2-Clause"

PV = "0.8.4"

RPM_NAME = "python311-flexx-0.8.4-1.7.noarch.rpm"
RPM_HASH = "b3628fa73309f7012a2f90b9111f5fe50a6e07e5e53c809082de2a001ec8e0817e3668c854605919d8b70b7d28fd3d9a67df7e1d13acebf2f6a6c3cc9e9eeb7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexx \
python3.11dist-flexx \
python311-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dialite \
python311-pscript \
python311-tornado \
python311-webruntime \
update-alternatives"

inherit rpm
