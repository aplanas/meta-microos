SUMMARY = "Lua API for collectd"
DESCRIPTION = "Optional collectd Lua API in order to write collectd plugins in Lua."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-lua-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "898695bb7344257a288396c93caaf5295d81b4276da9c18d813d80a35e8dce5b724b3c7433804ef5c6a2129f16c49c10d71a99ad87904611559ef5daaf80df4f"

RPROVIDES:${PN} += "collectd-plugin-lua collectd-plugin-lua(aarch-64)"
RDEPENDS:${PN} += "collectd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblua5.4.so.5()(64bit) lua"

inherit rpm
