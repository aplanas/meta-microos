SUMMARY = "Perl Client for Selenium Remote Driver"
DESCRIPTION = "Selenium is a test tool that allows you to write automated web application \
UI tests in any programming language against any HTTP website using any \
mainstream JavaScript-enabled browser. This module is an implementation of \
the client for the Remote driver that Selenium provides. You can find \
bindings for other languages at this location: \
 \
https://www.seleniumhq.org/download/ \
 \
This module sends commands directly to the Server using HTTP. Using this \
module together with the Selenium Server, you can automatically control any \
supported browser. To use this module, you need to have already downloaded \
and started the Selenium Server (Selenium Server is a Java application)."
LICENSE = "Apache-2.0"

PV = "1.49"

RPM_NAME = "perl-Selenium-Remote-Driver-1.49-1.2.aarch64.rpm"
RPM_HASH = "9ed64a5e96b1a328725ae5bf3e72366a06b499d9a70ec30dff36c95af7d080d9a74cd66a0c50a31c9fb2aba2dd6b6f62b58f5987cc5a24b20f20e373d7d8b5a6"

RPROVIDES:${PN} += "perl-Selenium--ActionChains \
perl-Selenium--CanStartBinary \
perl-Selenium--CanStartBinary--FindBinary \
perl-Selenium--CanStartBinary--ProbePort \
perl-Selenium--Chrome \
perl-Selenium--Edge \
perl-Selenium--Firefox \
perl-Selenium--Firefox--Binary \
perl-Selenium--Firefox--Profile \
perl-Selenium--InternetExplorer \
perl-Selenium--PhantomJS \
perl-Selenium--Remote--Commands \
perl-Selenium--Remote--Driver \
perl-Selenium--Remote--Driver--CanSetWebdriverContext \
perl-Selenium--Remote--Driver--Firefox--Profile \
perl-Selenium--Remote--ErrorHandler \
perl-Selenium--Remote--Finders \
perl-Selenium--Remote--Mock--Commands \
perl-Selenium--Remote--Mock--RemoteConnection \
perl-Selenium--Remote--RemoteConnection \
perl-Selenium--Remote--Spec \
perl-Selenium--Remote--WDKeys \
perl-Selenium--Remote--WebElement \
perl-Selenium--Waiter \
perl-Selenium-Remote-Driver \
perl-Test--Selenium--Chrome \
perl-Test--Selenium--Edge \
perl-Test--Selenium--Firefox \
perl-Test--Selenium--InternetExplorer \
perl-Test--Selenium--PhantomJS \
perl-Test--Selenium--Remote--Driver \
perl-Test--Selenium--Remote--Role--DoesTesting \
perl-Test--Selenium--Remote--WebElement"

RDEPENDS:${PN} += "lsof \
perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Zip \
perl-Clone \
perl-File--Which \
perl-HTTP--Headers \
perl-HTTP--Request \
perl-HTTP--Response \
perl-IO--String \
perl-IO--Uncompress--Unzip \
perl-JSON \
perl-LWP--UserAgent \
perl-List--Util \
perl-Moo \
perl-Moo--Role \
perl-Sub--Install \
perl-Test--LongString \
perl-Try--Tiny \
perl-XML--Simple \
perl-namespace--clean"

inherit rpm
