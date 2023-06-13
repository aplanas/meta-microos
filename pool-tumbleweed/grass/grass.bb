SUMMARY = "Geographic Resources Analysis Support System"
DESCRIPTION = "GRASS (Geographic Resources Analysis Support System), commonly \
referred to as GRASS, is a Geographic Information System \
(GIS) used for geospatial data management and analysis, image \
processing, graphics/maps production, spatial modeling, and \
visualization. GRASS is currently used in academic and commercial \
settings around the world, as well as by many governmental agencies \
and environmental consulting companies."
LICENSE = "GPL-2.0-or-later"

PV = "8.2.1"

RPM_NAME = "grass-8.2.1-1.3.aarch64.rpm"
RPM_HASH = "59de5e3cc608eb989eaddee7ec7ea951dd281ab09d3cd8222c603c72a5a09bf9ccbc5e8a5e1e6d4cd1583b8516dc1c9741a6ac6e2be455cb865dcb077985e535"

RPROVIDES:${PN} += "application() \
application(grass.desktop) \
config(grass) \
grass \
grass(aarch-64) \
libgrass_arraystats.8.2.so()(64bit) \
libgrass_bitmap.8.2.so()(64bit) \
libgrass_btree.8.2.so()(64bit) \
libgrass_btree2.8.2.so()(64bit) \
libgrass_cairodriver.8.2.so()(64bit) \
libgrass_calc.8.2.so()(64bit) \
libgrass_ccmath.8.2.so()(64bit) \
libgrass_cdhc.8.2.so()(64bit) \
libgrass_cluster.8.2.so()(64bit) \
libgrass_datetime.8.2.so()(64bit) \
libgrass_dbmibase.8.2.so()(64bit) \
libgrass_dbmiclient.8.2.so()(64bit) \
libgrass_dbmidriver.8.2.so()(64bit) \
libgrass_dbstubs.8.2.so()(64bit) \
libgrass_dgl.8.2.so()(64bit) \
libgrass_dig2.8.2.so()(64bit) \
libgrass_display.8.2.so()(64bit) \
libgrass_driver.8.2.so()(64bit) \
libgrass_dspf.8.2.so()(64bit) \
libgrass_g3d.8.2.so()(64bit) \
libgrass_gis.8.2.so()(64bit) \
libgrass_gmath.8.2.so()(64bit) \
libgrass_gpde.8.2.so()(64bit) \
libgrass_gproj.8.2.so()(64bit) \
libgrass_htmldriver.8.2.so()(64bit) \
libgrass_imagery.8.2.so()(64bit) \
libgrass_interpdata.8.2.so()(64bit) \
libgrass_interpfl.8.2.so()(64bit) \
libgrass_iortho.8.2.so()(64bit) \
libgrass_lidar.8.2.so()(64bit) \
libgrass_linkm.8.2.so()(64bit) \
libgrass_lrs.8.2.so()(64bit) \
libgrass_manage.8.2.so()(64bit) \
libgrass_neta.8.2.so()(64bit) \
libgrass_nviz.8.2.so()(64bit) \
libgrass_ogsf.8.2.so()(64bit) \
libgrass_pngdriver.8.2.so()(64bit) \
libgrass_psdriver.8.2.so()(64bit) \
libgrass_qtree.8.2.so()(64bit) \
libgrass_raster.8.2.so()(64bit) \
libgrass_rli.8.2.so()(64bit) \
libgrass_rowio.8.2.so()(64bit) \
libgrass_rtree.8.2.so()(64bit) \
libgrass_segment.8.2.so()(64bit) \
libgrass_shape.8.2.so()(64bit) \
libgrass_sim.8.2.so()(64bit) \
libgrass_sqlp.8.2.so()(64bit) \
libgrass_stats.8.2.so()(64bit) \
libgrass_symb.8.2.so()(64bit) \
libgrass_temporal.8.2.so()(64bit) \
libgrass_vector.8.2.so()(64bit) \
libgrass_vedit.8.2.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXrender.so.1()(64bit) \
libblas.so.3()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfftw3.so.3()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdal.so.32()(64bit) \
libgeos_c.so.1()(64bit) \
libgomp.so.1()(64bit) \
libhistory.so.8()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libnetcdf.so.19()(64bit) \
libodbc.so.2()(64bit) \
libpdal_base.so.13()(64bit) \
libpdal_util.so.13()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpq.so.5()(64bit) \
libproj.so.25()(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
proj \
python3-dateutil \
python3-numpy \
python3-opengl \
python3-wxPython \
python3-xml \
sqlite \
unixODBC \
xterm"

inherit rpm
