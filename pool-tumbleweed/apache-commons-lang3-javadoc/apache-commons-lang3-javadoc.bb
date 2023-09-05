SUMMARY = "Javadoc for apache-commons-lang3"
DESCRIPTION = "Javadoc for apache-commons-lang3."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "apache-commons-lang3-javadoc-3.12.0-3.1.noarch.rpm"
RPM_HASH = "3d3690cba4db77eda342ef6ccc31b3607dea355c9c804c55df9f65708b8946ed7f36f2709c29550e569840ea342bade88845f1fb51edca8d40c1cc98dec221ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
