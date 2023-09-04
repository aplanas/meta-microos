SUMMARY = "Git-compatible config file parsing"
DESCRIPTION = "This module handles interaction with configuration files of the style used \
by the version control system Git. It can both parse and modify these \
files, as well as create entirely new ones. \
 \
You only need to know a few things about the configuration format in order \
to use this module. First, a configuration file is made up of key/value \
pairs. Every key must be contained in a section. Sections can have \
subsections, but they don't have to. For the purposes of setting and \
getting configuration variables, we join the section name, subsection name, \
and variable name together with dots to get a key name that looks like \
'section.subsection.variable'. These are the strings that you'll be passing \
in to 'key' arguments. \
 \
Configuration files inherit from each other. By default, 'Config::GitLike' \
loads data from a system-wide configuration file, a per-user configuration \
file, and a per-directory configuration file, but by subclassing and \
overriding methods you can obtain any combination of configuration files. \
By default, configuration files that don't exist are just skipped. \
 \
See \
http://www.kernel.org/pub/software/scm/git/docs/git-config.html#_configurat \
ion_file for details on the syntax of git configuration files. We won't \
waste pixels on the nitty gritty here. \
 \
While the behavior of a couple of this module's methods differ slightly \
from the 'git config' equivalents, this module can read any config file \
written by git. The converse is usually true, but only if you don't take \
advantage of this module's increased permissiveness when it comes to key \
names. (See DIFFERENCES FROM GIT-CONFIG for details.) \
 \
This is an object-oriented module using Moo. All subroutines are object \
method calls. \
 \
A few methods have parameters that are always used for the same purpose:"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.18"

RPM_NAME = "perl-Config-GitLike-1.18-1.15.noarch.rpm"
RPM_HASH = "3bbc7817f1e1c8c6e5ae5709b1f279d5db027f19900eab9275a4298da6d9d0d249daed0125e67047564ffb61eb5e4dd311c5240c2cfd7fd7825745cb7e058806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--GitLike \
perl-Config--GitLike--Cascaded \
perl-Config--GitLike--Git \
perl-Config-GitLike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moo \
perl-MooX--Types--MooseLike"

inherit rpm
