SUMMARY = "Tiny Editor with Many Different Modes like Vi, Emacs, and Wordstar"
DESCRIPTION = "A very tiny editor, which offers many different modes like Vi, Emacs, and \
Wordstar. Wordstar is the default mode."
LICENSE = "GPL-2.0+"

PV = "2.82"

RPM_NAME = "e3-2.82-1.17.aarch64.rpm"
RPM_HASH = "728015429949cd0223546fd4cf690b9caaec8d8daed0c009f5e45241dbcb5e300658b7c37dcde44cb6ce8d879b23328ef5ee2afcf9db82a4487c190cecf8aa78"

RPROVIDES:${PN} += "e3 \
e3(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
