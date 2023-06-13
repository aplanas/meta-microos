SUMMARY = "Tool to repackage Java libraries"
DESCRIPTION = "Jar Jar Links is a utility that repackages Java libraries and embeds \
them into a distribution of its own. This is useful for two reasons: \
You can easily ship a single jar file with no external dependencies. \
You can avoid problems where your library depends on a specific \
version of a library, which may conflict with the dependencies of \
another library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4"

RPM_NAME = "jarjar-javadoc-1.4-4.11.noarch.rpm"
RPM_HASH = "05e1eea28dfe678266d18a14db72b097cd223756e823665ef6aeae0dc4ba0ab9bf4249ab46d223bfa0a8234a171d3d728acfec3f6d4a458124fbf6c92e0a1c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jarjar-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
