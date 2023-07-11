SUMMARY = "Build and Scan Parse-Trees of Html"
DESCRIPTION = "HTML-Tree is a suite of Perl modules for making parse trees out of HTML \
source. It consists of mainly two modules, whose documentation you should \
refer to: HTML::TreeBuilder and HTML::Element. \
 \
HTML::TreeBuilder is the module that builds the parse trees. (It uses \
HTML::Parser to do the work of breaking the HTML up into tokens.) \
 \
The tree that TreeBuilder builds for you is made up of objects of the class \
HTML::Element. \
 \
If you find that you do not properly understand the documentation for \
HTML::TreeBuilder and HTML::Element, it may be because you are unfamiliar \
with tree-shaped data structures, or with object-oriented modules in \
general. Sean Burke has written some articles for _The Perl Journal_ \
('www.tpj.com') that seek to provide that background. The full text of \
those articles is contained in this distribution, as: \
 \
* HTML::Tree::AboutObjects \
 \
'User's View of Object-Oriented Modules' from TPJ17. \
 \
* HTML::Tree::AboutTrees \
 \
'Trees' from TPJ18 \
 \
* HTML::Tree::Scanning \
 \
'Scanning HTML' from TPJ19 \
 \
Readers already familiar with object-oriented modules and tree-shaped data \
structures should read just the last article. Readers without that \
background should read the first, then the second, and then the third."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "5.07"

RPM_NAME = "perl-HTML-Tree-5.07-1.21.noarch.rpm"
RPM_HASH = "4e4049fd58659e93456dcb48911bc3315798f721c6562ffd2af78f974a6a6b641dad3d433a2384633e97aeb13ddb6d4786396fe1d585887f533e35d80f51d56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--AsSubs \
perl-HTML--Element \
perl-HTML--Element--traverse \
perl-HTML--Parse \
perl-HTML--Tree \
perl-HTML--TreeBuilder \
perl-HTML-Tree"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-HTML--Tagset"

inherit rpm
