SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688579291.d13a461"

RPM_NAME = "os-autoinst-swtpm-4.6.1688579291.d13a461-1.1.aarch64.rpm"
RPM_HASH = "906535b276d5358fe7487483c958470af2b050257c57d8856e0fdd18530453fcdbfb279c51d0eb31797ed7378f70c77ad2a18aca6450ee1a6a62230317235032"

RPROVIDES:${PN} += "os-autoinst-swtpm"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
