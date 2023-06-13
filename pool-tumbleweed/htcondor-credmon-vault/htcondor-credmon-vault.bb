SUMMARY = "Vault credmon for HTCondor."
DESCRIPTION = "The Vault credmon allows users to obtain credentials from Vault using \
htgettoken and to use those credentials securely inside running jobs."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-credmon-vault-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "5e2d3f8f50d048895902d9b1bfbef38eddaa043a29e52b6462b840de5a395caa6262dd1752f52b087427865021c322d36f78c6363a1d21fd20079dbd553de38e"

RPROVIDES:${PN} += "htcondor-credmon-vault \
htcondor-credmon-vault(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
htcondor \
python3-condor \
python3-six"

inherit rpm
