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

RPM_NAME = "python310-flexx-0.8.4-1.7.noarch.rpm"
RPM_HASH = "24f4df08af14051de051a9ff045bc09473164717bfea565116f005aba94640f3f10a8092c23628706e0209c175ecfee8b4525d0c3125495f83ef5c661b27f077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flexx \
python310-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dialite \
python310-pscript \
python310-tornado \
python310-webruntime \
update-alternatives"

inherit rpm
