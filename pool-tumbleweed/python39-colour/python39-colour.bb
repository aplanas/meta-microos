SUMMARY = "Python module to convert between color representations (RGB, HSL, web)"
DESCRIPTION = "Python module to convert between color representations: \
  * RGB, HSL, 6-digit hex, 3-digit hex, human color \
  * One object (Color) or several single purpose functions \
    (rgb2hex, hsl2rgb, ...) \
  * Web format which uses the smallest representation between \
    6-digit (e.g. #fa3b2c), 3-digit (e.g. #fbb), fully spelled \
    color (e.g. white), following W3C color naming for compatible \
    CSS or HTML color specifications \
  * Color scale generation choosing N color gradients \
  * It's possible to pick colors to identify objects of the \
    application being developed"
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "python39-colour-0.1.5-3.12.noarch.rpm"
RPM_HASH = "0ed5d184c4354f86efda11dbd52b0c0fe80002866e768b47fa781f4cf27d0b9683efefc18cf674b636cbcb86caf71dfbd3946fa46693a5846f26c5d0d9489e61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colour \
python39-colour \
python3dist-colour"

RDEPENDS:${PN} += "python-abi"

inherit rpm
