SUMMARY = "A pure Ruby implementation of the SFTP client protocol"
DESCRIPTION = "A pure Ruby implementation of the SFTP client protocol."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "ruby3.2-rubygem-net-sftp-4.0.0-1.5.aarch64.rpm"
RPM_HASH = "b72746f95d7297bf794274f9c0ce9057097eb41765e77a3380c173c69fc5caa9479da2d3bc09b8110c57c2f368454ecbd6520e60ae64a351a068991e184a0bc7"

RPROVIDES:${PN} += "ruby3.2-rubygem-net-sftp \
rubygem-net-sftp \
rubygem-ruby-3.2.0-net-sftp \
rubygem-ruby-3.2.0-net-sftp-4 \
rubygem-ruby-3.2.0-net-sftp-4.0 \
rubygem-ruby-3.2.0-net-sftp-4.0.0"

RDEPENDS:${PN} += "ruby-abi \
rubygem-ruby-3.2.0-net-ssh"

inherit rpm
