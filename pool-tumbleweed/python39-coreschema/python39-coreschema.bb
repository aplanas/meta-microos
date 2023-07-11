SUMMARY = "Core Schema for Core API"
DESCRIPTION = "Core Schema for Core API, a format-independent Document Object Model for \
representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "0.0.4"

RPM_NAME = "python39-coreschema-0.0.4-2.1.noarch.rpm"
RPM_HASH = "e13984a0e94504dc66bc9117e2525ba4bcef1cef458270eb6342f84ea0851bd84483bfce866895ea89d0dd060c89864f4dd58bcf504a8cf7f42f56f913709666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coreschema \
python39-coreschema \
python3dist-coreschema"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2"

inherit rpm
