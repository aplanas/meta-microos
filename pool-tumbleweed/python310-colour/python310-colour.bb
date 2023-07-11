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

RPM_NAME = "python310-colour-0.1.5-3.14.noarch.rpm"
RPM_HASH = "d45ea757cca546405db7727322a063a49e69c9b6451dd11b98406daf62c94c3de6b6b71c5c6787a945ef7417a6a1efc2594b69e2014b1dab2fc835be3a0dcc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-colour \
python310-colour \
python3dist-colour"

RDEPENDS:${PN} += "python-abi"

inherit rpm
