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

RPM_NAME = "ssh-audit-2.9.0-1.2.noarch.rpm"
RPM_HASH = "b43a5b7dd099fd0ef3ab01b5bf603238f327f7e71d6cd53b8823d6e7d7b43bd9cd6cfa11e745fa4e1fb7ef7eef703164496d86f878a746871a954dc1b5389c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ssh-audit \
python3dist-ssh-audit \
ssh-audit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3"

inherit rpm
