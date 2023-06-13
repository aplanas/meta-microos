SUMMARY = "Log4r, logging framework for ruby"
DESCRIPTION = "See also: http://logging.apache.org/log4j."
LICENSE = "GPL-2.0+ | Ruby"

PV = "1.1.10"

RPM_NAME = "ruby3.2-rubygem-log4r-1.1.10-9.31.aarch64.rpm"
RPM_HASH = "496d5c6416c2b46171dd6e24ad692a60cd255abfbfc99d945f7dca08eee706dca5040e67016ff3d1bba3e1d3a75ede449cd2929080c1eeffc93997da0c62f023"

RPROVIDES:${PN} += "ruby3.2-rubygem-log4r \
ruby3.2-rubygem-log4r(aarch-64) \
rubygem(log4r) \
rubygem(ruby:3.2.0:log4r) \
rubygem(ruby:3.2.0:log4r:1) \
rubygem(ruby:3.2.0:log4r:1.1) \
rubygem(ruby:3.2.0:log4r:1.1.10)"

RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
