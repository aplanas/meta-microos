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

RPM_NAME = "python39-flexx-0.8.4-1.7.noarch.rpm"
RPM_HASH = "348d45036899d99b1d2c6b4aaf4ebe0906a382d42323855de1fc795a66d053e1f663bdde11a08d4e49b70e6a7e4eda17e3f3f2616d0d12903607260c4133f845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flexx \
python39-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dialite \
python39-pscript \
python39-tornado \
python39-webruntime \
update-alternatives"

inherit rpm
