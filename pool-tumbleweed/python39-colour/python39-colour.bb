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

RPM_NAME = "python39-colour-0.1.5-3.14.noarch.rpm"
RPM_HASH = "b247cb153e3c36bda4d53ccafc00e9cdeaca693807849018994894be454b357a18792b98b15f533d643c927010621da489b0fa921f58f8bd8c4923976ab4ceeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-colour \
python39-colour \
python3dist-colour"

RDEPENDS:${PN} += "python-abi"

inherit rpm
