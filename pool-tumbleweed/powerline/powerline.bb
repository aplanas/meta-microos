SUMMARY = "Status line and prompt utility"
DESCRIPTION = "Powerline is a status line plugin for vim, and provides status lines and prompts \
for several other applications, including zsh, bash, tmux, IPython, Awesome and \
Qtile."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "powerline-2.8.3-3.1.aarch64.rpm"
RPM_HASH = "3f62325a814cd143c41004723bde673003bf6cd1237002c9a6f80bf37d50f0aacd5bcc64b8a4b16b4f4a331ef70467cbd8d5b627cd9b2b9244575a128e42732b"

RPROVIDES:${PN} += "config-powerline \
powerline \
python3-powerline-status \
python3.11dist-powerline-status \
python3dist-powerline-status"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
libc.so.6 \
powerline-fonts \
python-abi \
python3 \
python3-psutil \
systemd"

inherit rpm
