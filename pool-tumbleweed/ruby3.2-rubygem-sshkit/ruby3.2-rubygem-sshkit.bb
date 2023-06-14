SUMMARY = "SSHKit makes it easy to write structured, testable SSH commands in"
DESCRIPTION = "A comprehensive toolkit for remotely running commands in a structured manner \
on groups of servers."
LICENSE = "MIT"

PV = "1.21.3"

RPM_NAME = "ruby3.2-rubygem-sshkit-1.21.3-1.5.aarch64.rpm"
RPM_HASH = "a4c2f102060943c1e45dad8bd8b500b783b7e2d2bc8a5623186503686c8149ad0cbe24bbcdfa0e72006a840b684e1e403d4a06bb692913c7ad328a7f574a2f0a"

RPROVIDES:${PN} += "ruby3.2-rubygem-sshkit \
rubygem-ruby-3.2.0-sshkit \
rubygem-ruby-3.2.0-sshkit-1 \
rubygem-ruby-3.2.0-sshkit-1.21 \
rubygem-ruby-3.2.0-sshkit-1.21.3 \
rubygem-sshkit"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-net-scp \
rubygem-ruby-3.2.0-net-ssh"

inherit rpm
