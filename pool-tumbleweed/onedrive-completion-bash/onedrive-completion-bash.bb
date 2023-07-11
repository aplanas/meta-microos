SUMMARY = "OneDrive Bash completition"
DESCRIPTION = "OneDrive shell completions for Bash."
LICENSE = "GPL-3.0-only"

PV = "2.4.25"

RPM_NAME = "onedrive-completion-bash-2.4.25-1.1.aarch64.rpm"
RPM_HASH = "8863a1c99b260979a2243701cf8a1ff2ecff60943c4e7a2eab1699561fd270d424be9ee80dffe85b4cbf32f1b9b334b18489497c9ac71c3a67ba06fa7f267a17"

RPROVIDES:${PN} += "onedrive-completion-bash"

RDEPENDS:${PN} += "bash \
bash-completion \
onedrive"

inherit rpm
