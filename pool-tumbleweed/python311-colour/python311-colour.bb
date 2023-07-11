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

RPM_NAME = "python311-colour-0.1.5-3.14.noarch.rpm"
RPM_HASH = "8d5f9d7175c7f91927e5c60a56912feb31cf7f1c9901ddbf752beb175234e4d7d0478e915146d45389e00fdac302ca1e5bdc4ee49ec0afe72303a399424bbb27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colour \
python3.11dist-colour \
python311-colour \
python3dist-colour"

RDEPENDS:${PN} += "python-abi"

inherit rpm
