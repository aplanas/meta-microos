SUMMARY = "Patches text with given patch"
DESCRIPTION = "Text::Patch combines source text with given diff (difference) data. Diff \
data is produced by Text::Diff module or by the standard diff utility (man \
diff, see -u option). \
 \
* patch( $source, $diff, options... ) \
 \
  First argument is source (original) text. Second is the diff data. Third \
  argument can be either hash reference with options or all the rest \
  arguments will be considered patch options: \
 \
      $output = patch( $source, $diff, STYLE => 'Unified', ... ); \
 \
      $output = patch( $source, $diff, { STYLE => 'Unified', ... } ); \
 \
  Options are: \
 \
    STYLE => 'Unified' \
 \
  STYLE can be 'Unified', 'Context' or 'OldStyle'. \
 \
  The 'Unified' diff format looks like this: \
 \
    @@ -1,7 +1,6 @@ \
    -The Way that can be told of is not the eternal Way; \
    -The name that can be named is not the eternal name. \
     The Nameless is the origin of Heaven and Earth; \
    -The Named is the mother of all things. \
    +The named is the mother of all things. \
    + \
     Therefore let there always be non-being, \
       so we may see their subtlety, \
     And let there always be being, \
    @@ -9,3 +8,6 @@ \
     The two are the same, \
     But after they are produced, \
       they have different names. \
    +They both may be called deep and profound. \
    +Deeper and more profound, \
    +The door of all subtleties!"
LICENSE = "GPL-2.0+"

PV = "1.8"

RPM_NAME = "perl-Text-Patch-1.8-7.28.noarch.rpm"
RPM_HASH = "7d6b70d49f7b324c289d2373cdb580d532b993ec48edfa4a8f4d5703e73ef082ad48daf33467f794383235ee1cd2599464e508434a6e46eb9853ba0e0f7d2b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Patch \
perl-Text-Patch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Text--Diff"

inherit rpm
