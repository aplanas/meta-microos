SUMMARY = "System user wwwrun and group www"
DESCRIPTION = "This package provides the system account 'wwwrun' and group 'www'."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-user-wwwrun-20170617-24.14.noarch.rpm"
RPM_HASH = "05d2e8553ff34feef35d52cbf28938491e5fda79ffa2cf8d913b87f897f4491de044cf72ca85ee2c74c3be327b38524e25dcea9df1ae272f57ff98aac6faf52a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group(www) \
group(wwwrun) \
system-user-wwwrun \
user(wwwrun)"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
