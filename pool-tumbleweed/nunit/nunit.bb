SUMMARY = "Unit-testing framework for all .NET languages"
DESCRIPTION = "NUnit is a unit testing framework for all .NET languages. It serves the \
same purpose as JUnit does in the Java world. It supports test \
categories, testing for exceptions and writing test results in plain \
text or XML."
LICENSE = "Zlib"

PV = "2.6.4"

RPM_NAME = "nunit-2.6.4-4.19.aarch64.rpm"
RPM_HASH = "13f1ce90dba48c649b6334a0fac4a08c4685184fefaece26e45ec3c2c23c3579771feb55e5a499900957d6d4126dee5d5710b5939aaddb9f99f8f98c229c3540"

RPROVIDES:${PN} += "mono-NSubstitute \
mono-log4net \
mono-mock-assembly \
mono-nonamespace-assembly \
mono-nunit \
mono-nunit-agent \
mono-nunit-console \
mono-nunit-console-runner \
mono-nunit-console.tests \
mono-nunit-editor \
mono-nunit-editor.tests \
mono-nunit-gui-runner \
mono-nunit-gui.tests \
mono-nunit.core \
mono-nunit.core.interfaces \
mono-nunit.core.tests \
mono-nunit.core.tests.45 \
mono-nunit.framework \
mono-nunit.framework.tests \
mono-nunit.framework.tests.net45 \
mono-nunit.mocks \
mono-nunit.mocks.tests \
mono-nunit.uiexception \
mono-nunit.uiexception.tests \
mono-nunit.uikit \
mono-nunit.uikit.tests \
mono-nunit.util \
mono-nunit.util.tests \
mono-pnunit-agent \
mono-pnunit-launcher \
mono-pnunit.framework \
mono-pnunit.tests \
mono-test-assembly \
mono-test-assembly-net45 \
mono-test-utilities \
nunit"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-System \
mono-System.Configuration \
mono-System.Data \
mono-System.Drawing \
mono-System.Runtime.Remoting \
mono-System.Web \
mono-System.Windows.Forms \
mono-System.Xml \
mono-mscorlib"

inherit rpm
