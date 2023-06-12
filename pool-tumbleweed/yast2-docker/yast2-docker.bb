SUMMARY = "YaST2 - GUI for docker management"
DESCRIPTION = "Provides easy to use GUI for running docker containers."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-docker-4.6.0-1.1.noarch.rpm"
RPM_HASH = "75d4d4f955530c9ba10fee627f4680419e2c89eb6fb1c40c7b75fcf57688b7004d8b521824f343b4345fe02ab0739149f6d8ba12de710f89dfe8ac5a2e0bba2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.opensuse.yast.Docker.desktop) \
metainfo() \
metainfo(org.opensuse.yast.Docker.metainfo.xml) \
yast2-docker"
RDEPENDS:${PN} += "docker \
rubygem(ruby:3.2.0:docker-api) \
yast2 \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
