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

RPM_NAME = "python39-flexx-0.8.4-1.5.noarch.rpm"
RPM_HASH = "981cb43a16b246985cc2b2e6cdb5b56ef73cb11d3ab77100f4ed31219a2e5afae0815a4d631d7cbb1c94b6c3ff124ded1d22ba2513e110d526df768cae2e57a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flexx \
python39-flexx \
python3dist-flexx"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-dialite \
python39-pscript \
python39-tornado \
python39-webruntime \
update-alternatives"

inherit rpm
