SUMMARY = "Build.PL install path logic made easy"
DESCRIPTION = "This module tries to make install path resolution as easy as possible. \
 \
When you want to install a module, it needs to figure out where to install \
things. The nutshell version of how this works is that default installation \
locations are determined from ExtUtils::Config, and they may be \
individually overridden by using the 'install_path' attribute. An \
'install_base' attribute lets you specify an alternative installation root \
like _/home/foo_ and 'prefix' does something similar in a rather different \
(and more complicated) way. 'destdir' lets you specify a temporary \
installation directory like _/tmp/install_ in case you want to create \
bundled-up installable packages. \
 \
The following types are supported by default. \
 \
* * lib \
 \
Usually pure-Perl module files ending in _.pm_ or _.pod_. \
 \
* * arch \
 \
'Architecture-dependent' module files, usually produced by compiling XS, \
Inline, or similar code. \
 \
* * script \
 \
Programs written in pure Perl. In order to improve reuse, you may want to \
make these as small as possible - put the code into modules whenever \
possible. \
 \
* * bin \
 \
'Architecture-dependent' executable programs, i.e. compiled C code or \
something. Pretty rare to see this in a perl distribution, but it happens. \
 \
* * bindoc \
 \
Documentation for the stuff in 'script' and 'bin'. Usually generated from \
the POD in those files. Under Unix, these are manual pages belonging to the \
'man1' category. Unless explicitly set, this is only available on platforms \
supporting manpages. \
 \
* * libdoc \
 \
Documentation for the stuff in 'lib' and 'arch'. This is usually generated \
from the POD in _.pm_ and _.pod_ files. Under Unix, these are manual pages \
belonging to the 'man3' category. Unless explicitly set, this is only \
available on platforms supporting manpages. \
 \
* * binhtml \
 \
This is the same as 'bindoc' above, but applies to HTML documents. Unless \
explicitly set, this is only available when perl was configured to do so. \
 \
* * libhtml \
 \
This is the same as 'libdoc' above, but applies to HTML documents. Unless \
explicitly set, this is only available when perl was configured to do so."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.012"

RPM_NAME = "perl-ExtUtils-InstallPaths-0.012-1.18.noarch.rpm"
RPM_HASH = "9484a5a3655418e6185a95e471dca17b06f6c1cd2e68549fc528fb062ac1fd784624c2d4fcf69e51b15f96f97c92b758eaadc407978d3313d11cb4a0ce93e3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--InstallPaths \
perl-ExtUtils-InstallPaths"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-ExtUtils--Config"

inherit rpm
