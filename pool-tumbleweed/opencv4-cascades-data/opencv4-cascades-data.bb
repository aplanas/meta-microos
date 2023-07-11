SUMMARY = "Classifier cascades for OpenCV"
DESCRIPTION = "Haar and LBP cascades for face and object detecton"
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "opencv4-cascades-data-4.7.0-1.8.noarch.rpm"
RPM_HASH = "4829ba410c93b348362dfb3262ca04cbdf346ddabeddd559d18cb498bc3806d494b1619dbfdf4f312e89c54300d6a9232ff92d597c0d13ee7abde6433f466287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencv-/usr/share/opencv4/lbpcascades/lbpcascade-silverware.xml \
opencv4-cascades-data"

RDEPENDS:${PN} += ""

inherit rpm
