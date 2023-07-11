SUMMARY = "VPN over an SSH tunnel"
DESCRIPTION = "Transparent proxy server that works as a poor man's VPN. Forwards over ssh. \
Doesn't require admin. Supports DNS tunneling. \
sshuttle is a program that solves the following case: \
- You have access to a remote network via ssh. \
- You don't necessarily have admin access on the remote network. \
- The remote network has no VPN, or only complex VPN \
  protocols (IPsec, PPTP, etc). \
- You don't want to create an SSH port forward for every \
  single host/port on the remote network. \
- You can't use openssh's PermitTunnel feature because \
  it's disabled by default on openssh servers; plus it does \
  TCP-over-TCP, which has terrible performance."
LICENSE = "LGPL-2.1-only"

PV = "1.1.1"

RPM_NAME = "sshuttle-1.1.1-3.1.noarch.rpm"
RPM_HASH = "e6e115b86271ec412bdb6f293f872c58a30520234d9e0f189f78c588289a4597a4d55fd6d3e69b1752c2e0f0925474c0d6ddceb644e801459b245e6495712e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sshuttle \
python3dist-sshuttle \
sshuttle"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/python3.11 \
/usr/bin/sh \
/usr/bin/touch \
fillup \
python-abi"

inherit rpm
