SUMMARY = "Python at the shell"
DESCRIPTION = "Easily run Python at the shell! Magical, but never mysterious. \
 \
See README.md or https://github.com/hauntsaninja/pyp for examples."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-pyp-1.1.0-1.5.noarch.rpm"
RPM_HASH = "5fb75d06fa92646262d1dc00445bef84a3fae53c31f427c5a70eed93f0811e07dc08c98359a50f623959974c13f4037cbd5bb716ffa0cab68222ef588e106310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypyp \
python39-pyp \
python3dist-pypyp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astunparse \
update-alternatives"

inherit rpm
