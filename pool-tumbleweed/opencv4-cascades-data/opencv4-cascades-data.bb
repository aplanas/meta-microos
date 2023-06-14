SUMMARY = "Classifier cascades for OpenCV"
DESCRIPTION = "Haar and LBP cascades for face and object detecton"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "opencv4-cascades-data-4.7.0-1.6.noarch.rpm"
RPM_HASH = "ac9ba58dc12fbc864f644036acda4241a36b4f9794b5b7dfebaf1dfddbbbe3745f80f3338860af82b495a0d4b139ba107677d46b7b648e2db6296e174401e17b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencv-/usr/share/opencv4/lbpcascades/lbpcascade-silverware.xml \
opencv4-cascades-data"

RDEPENDS:${PN} += ""

inherit rpm
