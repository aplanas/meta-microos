SUMMARY = "Web UI development toolkit with prototype demo app"
DESCRIPTION = "This distro contains a foundation/framework/toolkit for developing the \
'front end' portion of web applications. \
 \
App::MFILE::WWW is a Plack application that provides a HTTP \
request-response handler (based on Web::Machine), CSS and HTML source code \
for an in-browser 'screen', and JavaScript code for displaying various \
'widgets' (menus, forms, etc.) in that screen and for processing user input \
from within those widgets. \
 \
In addition, infrastructure is included (but need not be used) for user \
authentication, session management, and communication with a backend server \
via AJAX calls. \
 \
Front ends built with App::MFILE::WWW will typicaly be menu-driven, \
consisting exclusively of fixed-width Unicode text, and capable of being \
controlled from the keyboard, without the use of a mouse. The overall \
look-and-feel is reminiscent of the text terminal era. \
 \
The distro comes with a prototype (demo) application to illustrate how the \
various widgets are used."
LICENSE = "BSD-3-Clause"

PV = "0.176"

RPM_NAME = "perl-App-MFILE-WWW-0.176-1.21.noarch.rpm"
RPM_HASH = "e4ccf939a4c09c2d7f36f4ac040fd77d4314f39b097f4ad5b546c5f367f4b0ec3df1634b16a00f643de62d0d8778d0f02b665533c4b2b5d55f6fcebc05c93fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--MFILE--WWW \
perl-App--MFILE--WWW--Dispatch \
perl-App--MFILE--WWW--Resource \
perl-App-MFILE-WWW"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-App--CELL \
perl-File--ShareDir \
perl-JSON \
perl-LWP--UserAgent \
perl-Log--Any--Adapter \
perl-Params--Validate \
perl-Plack--Builder \
perl-Plack--Middleware--Session \
perl-Plack--Middleware--StackTrace \
perl-Plack--Middleware--Static \
perl-Plack--Runner \
perl-Try--Tiny \
perl-Web--Machine"

inherit rpm
