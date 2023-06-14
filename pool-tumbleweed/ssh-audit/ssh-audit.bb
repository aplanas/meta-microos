SUMMARY = "SSH server auditing"
DESCRIPTION = "ssh-audit is a tool for ssh server auditing. \
 \
Features: \
 * SSH1 and SSH2 protocol server support; \
 * grab banner, recognize device or software and operating system, detect compression; \
 * gather key-exchange, host-key, encryption and message authentication code algorithms; \
 * output algorithm information (available since, removed/disabled, unsafe/weak/legacy, etc); \
 * output algorithm recommendations (append or remove based on recognized software version); \
 * output security information (related issues, assigned CVE list, etc); \
 * analyze SSH version compatibility based on algorithm information; \
 * historical information from OpenSSH, Dropbear SSH and libssh;"
LICENSE = "MIT"

PV = "2.9.0"

RPM_NAME = "ssh-audit-2.9.0-1.1.noarch.rpm"
RPM_HASH = "5e5279b0f94fc5f04554a099439da8e06ce883c1711198031016e35d04732c2d7bb9fd88bf23d4bda91590c4c0ebcf59dfbb609c7d83f0457a2e625268e05b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ssh-audit \
python3dist-ssh-audit \
ssh-audit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
