SUMMARY = "Apparmor Support"
DESCRIPTION = "Packages required to enable Apparmor on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-apparmor-5.0-72.1.aarch64.rpm"
RPM_HASH = "96bd1bb61b20b61674e2ce1cad1773fc34f2655a939e344bd980c533afef449545cd562a8e02114a95bb490e55557fb1e8d12e0a4c699b6d6283d42ca8af9961"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-apparmor"

RDEPENDS:${PN} += "apparmor-parser \
apparmor-profiles"

inherit rpm
