SUMMARY = "Javadoc for jformatstring"
DESCRIPTION = "Javadoc for jformatstring."
LICENSE = "GPL-2.0-only"

PV = "0.10~20131207"

RPM_NAME = "jformatstring-javadoc-0.10~20131207-3.6.noarch.rpm"
RPM_HASH = "29f61f6a0557e0cebbb8c22f26060eed564bfc96bf3e0bbca7279c4a57bda13a572a040c05bbd123ca52883cf77afe9ad0cd5d7fc64b0cc984c8aec4799abd59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jformatstring-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
