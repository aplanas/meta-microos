SUMMARY = "A debugger for debugging and testing of Erlang programs"
DESCRIPTION = "A debugger for debugging and testing of Erlang programs."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-debugger-25.3-1.1.aarch64.rpm"
RPM_HASH = "1aa90ab57deb498bacc9ab417fa80fc5182b69fcef870b4353e360f01927e00c0a3a5faf91e51cff45636ef17512fce0248fc3ae0f5d15e2ff60b662e691d605"

RPROVIDES:${PN} += "erlang-debugger erlang-debugger(aarch-64)"
RDEPENDS:${PN} += "erlang erlang-wx"

inherit rpm
