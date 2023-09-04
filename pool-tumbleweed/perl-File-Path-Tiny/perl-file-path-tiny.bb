SUMMARY = "Recursive versions of mkdir() and rmdir() without as much overhead as Fi[cut]"
DESCRIPTION = "The goal here is simply to provide recursive versions of mkdir() and \
rmdir() with as little code and overhead as possible. \
 \
This module is in no way meant to derogate File::Path and is in no way an \
endorsement to go out and replace all use of File::Path with \
File::Path::Tiny. \
 \
File::Path is very good at what it does but there's simply a lot happening \
that we can do without much of the time. \
 \
Here are some things File::Path has/does that this module attempts to do \
without: \
 \
* * multiple interfaces \
 \
Backwards compatibility brings in a lot of code and logic that we don't \
need from here on out. \
 \
* * chdir()s \
 \
It forces a ton of chdir()s which could leave you somewhere you're not \
planning on being and requires much more overhead to do. \
 \
This module provides a way to disable that if you know it is safe to do so \
in your circumstance. \
 \
* * can croak not allowing you to detect and handle failure \
 \
Just let me handle errors how I want. Don't make my entire app die or have \
to wrap it in an eval \
 \
The exception here is the security checks can croak, which is what you \
want. See DIAGNOSTICS for more info. \
 \
* * A well intentioned output system \
 \
Just let me do the output how I want. (Nothing, As HTML, print to a \
filehandle, etc...) \
 \
* * A well intentioned and experimental (IE subject to change) error \
  handling system. \
 \
Just keep it simple and detect failure via a boolean check and do what I \
want with the error. See 'How can I make/remove multiple paths?' \
 \
* * According to its POD, removing a tree is apparently not safe unless you \
  tell it to be with the ‘safe’ or 'keep_root' attributes. \
 \
Seems like that should just happen, I don't want to worry about \
accidentally removing / when I pass it /tmp"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0"

RPM_NAME = "perl-File-Path-Tiny-1.0-1.12.noarch.rpm"
RPM_HASH = "f94dee7890e9cf0b51cee9cb9c633acfeae236be85e899039b84b65dd80cf9fd67b556c08a3f952eb77e41ccefff551d9c3aa0733238d0be8fb77ddc2ad7949b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Path--Tiny \
perl-File-Path-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Exception"

inherit rpm
