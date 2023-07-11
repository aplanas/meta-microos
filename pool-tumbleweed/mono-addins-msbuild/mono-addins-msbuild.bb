SUMMARY = "Mono Addins Framework, MSBuild Support"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications. \
 \
This package contains MSBuild tasks file and target, which allows \
using add-in references directly in a build file (still experimental)."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-msbuild-1.3.3-2.17.noarch.rpm"
RPM_HASH = "199e0c035f3037128cf2e4fe04cc912f35ad3accaa633d04501e67bcca78ae4fede72b295c2a6a86c41d06c9a602d14baaf959c7ef74ba2bb2b330a5127058c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Mono.Addins.MSBuild \
mono-addins-msbuild \
mono-policy.0.2.Mono.Addins.MSBuild \
mono-policy.0.3.Mono.Addins.MSBuild \
mono-policy.0.4.Mono.Addins.MSBuild \
mono-policy.0.5.Mono.Addins.MSBuild \
mono-policy.0.6.Mono.Addins.MSBuild"

RDEPENDS:${PN} += "mono-Microsoft.Build.Framework \
mono-Microsoft.Build.Utilities.v4.0 \
mono-Mono.Addins \
mono-Mono.Addins.Setup \
mono-System \
mono-addins \
mono-mscorlib"

inherit rpm
