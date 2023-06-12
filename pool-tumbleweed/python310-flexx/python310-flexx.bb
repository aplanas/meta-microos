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

RPM_NAME = "python310-flexx-0.8.4-1.5.noarch.rpm"
RPM_HASH = "06eb73ac92a7629dfc1b1c6f46bcb473c2a31ec9eeab74d318288451da619bbf065abc00170037ae5f7390f0f10607f4aec5bef0ce7ca937a4e8c18ee5020cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flexx \
python3.10dist(flexx) \
python310-flexx \
python3dist(flexx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-dialite \
python310-pscript \
python310-tornado \
python310-webruntime \
update-alternatives"

inherit rpm
